package com.bugeater.bugeaterIntern.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugeater.bugeaterIntern.dto.MentorDTO;
import com.bugeater.bugeaterIntern.entity.Mentor;
import com.bugeater.bugeaterIntern.repository.MentorRepository;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class MentorServiceImpl implements MentorService {
	@Autowired
	MentorRepository mentorRepository;
	
	public List<MentorDTO> getAllMentors() {
		List<MentorDTO> mentorList = new ArrayList<>();
		Iterable<Mentor> mentorEnt = mentorRepository.findAll();
		
		mentorEnt.forEach(mentor -> {
			MentorDTO mentorDTO = new MentorDTO();
			mentorDTO.setMentorId(mentor.getMentorId());
			mentorDTO.setMentorName(mentor.getMentorName());
			mentorDTO.setMentorEmail(mentor.getMentorEmail());
			mentorDTO.setMentorPass(mentor.getMentorPass());
			mentorDTO.setMentorImg(mentor.getMentorImg());
			mentorDTO.setMentorMobile(mentor.getMentorMobile());
			mentorDTO.setMentorOrg(mentor.getMentorOrg());			
			mentorDTO.setMentorDesc(mentor.getMentorDesc());		
			mentorDTO.setMentorExp(mentor.getMentorExp());
			mentorList.add(mentorDTO);
		});
		return mentorList;
	}
}
