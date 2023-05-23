package dao;

import entity.BloodbankEntity;

import java.util.List;

public interface BloodBankDAO {
    void addBloodBank(BloodbankEntity bloodbank);

    BloodbankEntity getBloodBankByName(String name);

    List<BloodbankEntity> getAllBloodBanks();
}
