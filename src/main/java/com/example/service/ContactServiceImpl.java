package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Contact;
import com.example.persistancelayer.ContactDtlsEntity;
import com.example.persistancelayer.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDtlsRepository contactDtlsRepo;

	@Override
	public boolean saveContact(Contact c) {
		ContactDtlsEntity entity = new ContactDtlsEntity();
		/*
		 * entity.setContactName(c.getContactName)
		 * 
		 * entity.setContactEmail(c.getContactEmail)
		 * entity.setContactNum(c.getContactNum)
		 */
		BeanUtils.copyProperties(c, entity);
		ContactDtlsEntity savedEntity = contactDtlsRepo.save(entity);
		return savedEntity.getContactId() != null;

		/*
		 * if (savedEntity)!=null){ return true; } else{ return false;}
		 */
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contactsList=new ArrayList<Contact>();
		List<ContactDtlsEntity> entitieslist=contactDtlsRepo.findAll();
		entitieslist.forEach(entity->{
			Contact c=new Contact();
			BeanUtils.copyProperties(entity, c);
			contactsList.add(c);
		});
	
		return contactsList;
	}

	@Override
	public Contact getContactById(Integer cid) {
	Optional<ContactDtlsEntity> optional=contactDtlsRepo.findById(cid);
	if(optional.isPresent()) {
		ContactDtlsEntity entity=optional.get();
		Contact c=new Contact();
		BeanUtils.copyProperties(entity, c);
		return c;
	}
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		contactDtlsRepo.deleteById(cid);
		
		return true;
	}

}
