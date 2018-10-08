package com.nju.test.service;

import com.nju.test.entity.Store;

import java.util.List;

public interface StoreService {

    List<Store> getStoreList();

    Store getStoreById(int storeId);

    boolean addStore(Store store);

    boolean modifyStore(Store store);

    boolean deleteStore(int storeId);

}
