package com.nu1silva.xtracker.repo;

import com.nu1silva.xtracker.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
