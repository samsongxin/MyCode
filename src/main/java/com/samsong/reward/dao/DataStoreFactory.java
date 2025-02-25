package com.samsong.reward.dao;

public class DataStoreFactory {
    public static DataStore getDataStore(){
        return new InMemoryDataStore();
    }
}
