package org.launchcode.techjobs.persistent.models.data;


import org.launchcode.techjobs.persistent.models.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}