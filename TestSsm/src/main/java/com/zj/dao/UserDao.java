package com.zj.dao;

import com.zj.model.Userzj;

public interface UserDao {
    Userzj selectUser(long id);
}
