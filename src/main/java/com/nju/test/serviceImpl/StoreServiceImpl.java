package com.nju.test.serviceImpl;

import com.nju.test.dao.StoreMapper;
import com.nju.test.entity.Store;
import com.nju.test.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public List<Store> getStoreList() {
        return storeMapper.selectAll();
    }

    @Override
    public Store getStoreById(int storeId) {
        return storeMapper.selectByPrimaryKey(storeId);
    }

    @Transactional
    @Override
    public boolean addStore(Store store) {
        if (store.getStoreName() != null && !"".equals(store.getStoreName())){
            try{
                int effectedNum = storeMapper.insert(store);
                if (effectedNum > 0){
                    return true;
                } else {
                    throw new RuntimeException("失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("失败！" + e.getMessage());
            }
        } else {
            throw new RuntimeException("失败！");
        }
    }

    @Override
    public boolean modifyStore(Store store) {
        if (store.getStoreId() != null && store.getStoreId() > 0){
            try{
                int effectedNum = storeMapper.updateByPrimaryKey(store);
                if (effectedNum > 0){
                    return true;
                } else {
                    throw new RuntimeException("失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("失败！" + e.toString());
            }
        } else {
            throw new RuntimeException("失败！");
        }
    }

    @Override
    public boolean deleteStore(int storeId) {
        if (storeId > 0){
            try{
                int effectedNum = storeMapper.deleteByPrimaryKey(storeId);
                if (effectedNum > 0){
                    return true;
                } else {
                    throw new RuntimeException("失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("失败！" + e.toString());
            }
        } else {
            throw new RuntimeException("失败！");
        }
    }
}
