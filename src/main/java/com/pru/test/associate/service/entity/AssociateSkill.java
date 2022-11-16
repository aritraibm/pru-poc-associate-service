package com.pru.test.associate.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("associate_skill")
public class AssociateSkill {

    private Long skillId;
    private String skillRating;
    
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkillRating() {
		return skillRating;
	}
	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}
}
