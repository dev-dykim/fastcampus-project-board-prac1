package com.fastcampus.projectboardprac1.repository;

import com.fastcampus.projectboardprac1.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
