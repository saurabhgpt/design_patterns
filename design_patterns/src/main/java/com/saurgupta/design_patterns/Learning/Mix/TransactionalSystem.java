package com.saurgupta.design_patterns.Learning.Mix;

import java.util.*;

public class TransactionalSystem {
    static Map<String, String> globalKVStore, internalKVStore;
    static List<Transaction> transactionList;
    static boolean inATransaction;

    public static void main(String[] args) {
        globalKVStore = new HashMap<>();
        internalKVStore = new HashMap<>();
        inATransaction = false;
        // part 1
        System.out.println("part 1");
        System.out.println(read("key1"));
        System.out.println(create("key1", "val1"));
        System.out.println(read("key1"));
        System.out.println(update("key1", "val2"));
        System.out.println(read("key1"));
        System.out.println(delete("key1"));
        System.out.println(read("key1"));

        // cleaningUp resources
        globalKVStore = new HashMap<>();

        // part 2.1
        System.out.println("part 2.1");
        System.out.println(create("key1", "val1"));
        System.out.println(create("key2", "val2"));
        System.out.println(create("key3", "val3"));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));

        System.out.println(begin());
        System.out.println(create("key3", "val8"));
        System.out.println(read("key3"));
        System.out.println(create("key5", "val5"));
        System.out.println(read("key5"));
        System.out.println(update("key5", "val7"));
        System.out.println(read("key5"));
        System.out.println(update("key2", "val7"));
        System.out.println(read("key2"));
        System.out.println(update("key2", "val8"));
        System.out.println(read("key2"));
        System.out.println(delete("key1"));
        System.out.println(read("key1"));
        System.out.println(commit(2));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));

        // cleaningUp resources
        globalKVStore = new HashMap<>();

        // part 2.2
        System.out.println("part 2.2");
        System.out.println(create("key1", "val1"));
        System.out.println(create("key2", "val2"));
        System.out.println(create("key3", "val3"));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));

        System.out.println(begin());
        System.out.println(create("key3", "val8"));
        System.out.println(read("key3"));
        System.out.println(create("key5", "val5"));
        System.out.println(read("key5"));
        System.out.println(update("key5", "val7"));
        System.out.println(read("key5"));
        System.out.println(update("key2", "val7"));
        System.out.println(read("key2"));
        System.out.println(update("key2", "val8"));
        System.out.println(read("key2"));
        System.out.println(delete("key1"));
        System.out.println(read("key1"));
        System.out.println(rollback(2));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));
        System.out.println(read("key5"));

        // cleaningUp resources
        globalKVStore = new HashMap<>();

        // part 3.1
        System.out.println("part 3.1");
        System.out.println(create("key1", "val1"));
        System.out.println(create("key2", "val2"));
        System.out.println(create("key3", "val3"));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));

        System.out.println(begin());
        System.out.println(create("key3", "val8"));
        System.out.println(read("key3"));
        System.out.println(create("key5", "val5"));
        System.out.println(read("key5"));
        System.out.println(update("key5", "val7"));
        System.out.println(read("key5"));
        System.out.println(update("key2", "val7"));
        System.out.println(read("key2"));
        System.out.println(update("key2", "val8"));
        System.out.println(read("key2"));
        System.out.println(delete("key1"));
        System.out.println(read("key1"));
        System.out.println(commit(2));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));
        System.out.println(read("key5"));

        // cleaningUp resources
        globalKVStore = new HashMap<>();

        // part 3.2
        System.out.println("part 3.2");
        System.out.println(create("key1", "val1"));
        System.out.println(create("key2", "val2"));
        System.out.println(create("key3", "val3"));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));

        System.out.println(begin());
        System.out.println(create("key3", "val8"));
        System.out.println(read("key3"));
        System.out.println(create("key5", "val5"));
        System.out.println(read("key5"));
        System.out.println(update("key5", "val7"));
        System.out.println(read("key5"));
        System.out.println(update("key2", "val7"));
        System.out.println(read("key2"));
        System.out.println(update("key2", "val8"));
        System.out.println(read("key2"));
        System.out.println(delete("key1"));
        System.out.println(read("key1"));
        System.out.println(rollback(2));
        System.out.println(read("key1"));
        System.out.println(read("key2"));
        System.out.println(read("key3"));
        System.out.println(read("key5"));

    }

    private static String rollback(int transactionsToRollBack) {
        return rollbackTheTransaction(transactionsToRollBack);
    }

    private static String rollbackTheTransaction(int transactionsToRollBack) {
        if(transactionsToRollBack > 0) {
            revertSomeTransactions(transactionsToRollBack);
            commitEverything();
        }
        inATransaction = false;
        return "Transaction rolled back";
    }

    private static void revertSomeTransactions(int transactionsToRollBack) {
        Collections.reverse(transactionList);
        for(Transaction transaction: transactionList) {
            if(transactionsToRollBack == 0)
                break;
            transactionsToRollBack -= 1;
            TransactionType transactionType = transaction.transactionType;
            switch (transactionType) {
                case DELETE -> internalKVStore.put(transaction.key, transaction.oldVal);
                case UPDATE -> internalKVStore.put(transaction.key, transaction.oldVal);
                case CREATE -> internalKVStore.remove(transaction.key);
            }
        }
    }

    private static String commit(int transactionCountToCommit) {
        return commitTheTransaction(transactionCountToCommit);
    }

    private static String commitTheTransaction(int transactionCountToCommit) {
        if(transactionCountToCommit == 0)
            commitEverything();
        else
            commitLimitedTransactions(transactionCountToCommit);

        inATransaction = false;
        return "Transaction commit success";
    }

    private static void commitLimitedTransactions(int transactionCountToCommit) {
        for(Transaction transaction: transactionList) {
            if(transactionCountToCommit == 0)
                break;
            transactionCountToCommit -= 1;
            TransactionType transactionType = transaction.transactionType;
            switch (transactionType) {
                case CREATE -> globalKVStore.put(transaction.key, transaction.newVal);
                case UPDATE -> globalKVStore.put(transaction.key, transaction.newVal);
                case DELETE -> {
                    if(globalKVStore.containsKey(transaction.key))
                        globalKVStore.remove(transaction.key);
                }
            }
        }
    }

    private static void commitEverything() {
        for(String key: internalKVStore.keySet()) {
            if(internalKVStore.get(key) != null)
                globalKVStore.put(key, internalKVStore.get(key));
            else if(globalKVStore.containsKey(key))
                globalKVStore.remove(key);
        }
    }

    private static String begin() {
        return beginTransaction();
    }

    private static String beginTransaction() {
        inATransaction = true;
        transactionList = new ArrayList<>();
        internalKVStore = new HashMap<>();
        return "Transaction begin";
    }

    private static String delete(String key) {
        return deleteEntry(key);
    }

    private static String deleteEntry(String key) {
        if(inATransaction) {
            addNewTransaction(TransactionType.DELETE, key, null);
            internalKVStore.put(key, null);
        } else
            globalKVStore.remove(key);
        return "Delete Success";
    }

    private static String update(String key, String val) {
        return updateEntry(key, val);
    }

    private static String updateEntry(String key, String val) {
        if(inATransaction) {
            addNewTransaction(TransactionType.UPDATE, key, val);
            internalKVStore.put(key, val);
        } else
            globalKVStore.put(key, val);
        return val;
    }

    public static String read(String key) {
        return readFromStore(key);
    }
    public static String create(String key, String val) {
        return createEntry(key, val);
    }

    private static String createEntry(String key, String val) {
        if(inATransaction) {
            addNewTransaction(TransactionType.CREATE, key, val);
            internalKVStore.put(key, val);
        } else
            globalKVStore.put(key, val);
        return val;
    }

    private static void addNewTransaction(TransactionType transactionType, String key, String val) {
        String oldVal = null;
        if(internalKVStore.containsKey(key))
            oldVal = internalKVStore.get(key);
        else if(globalKVStore.containsKey(key))
            oldVal = globalKVStore.get(key);
        if(oldVal != null && transactionType.equals(TransactionType.CREATE)) {
            transactionType = TransactionType.UPDATE;
        }
        Transaction transaction = new Transaction(transactionType, key, oldVal, val);
        transactionList.add(transaction);
    }

    private static String readFromStore(String key) {
        if(inATransaction && internalKVStore.containsKey((key))) {
            if(internalKVStore.get(key) != null)
                return internalKVStore.get(key);
            return "Key not present";
        }
        return globalKVStore.getOrDefault(key, "Key not present");
    }
}

class Transaction {
    TransactionType transactionType;
    String key, oldVal, newVal;

    public Transaction(TransactionType transactionType, String key, String oldVal, String newVal) {
        this.transactionType = transactionType;
        this.key = key;
        this.oldVal = oldVal;
        this.newVal = newVal;
    }
}

enum TransactionType {
    CREATE, UPDATE, DELETE
}