package com.nju.test.service;

import com.nju.test.entity.Address;

import java.util.List;

public interface AddressService {

//    String getAddressStrById(int addressId);

    Address getAddressById(int addressId);

    List<Address> getAddressList(int userId);

    boolean addAddress(Address address);

    boolean modifyAddress(Address address);

    boolean deleteAddress(int addressId);
}
