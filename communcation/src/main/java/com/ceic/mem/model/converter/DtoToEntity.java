package com.ceic.mem.model.converter;

import com.ceic.mem.persistence.entity.CountryEntity;
import com.ceic.mem.persistence.entity.EmployeeEntity;
import com.ceic.mem.persistence.entity.FamilyDetailsEntity;
import com.ceic.mem.persistence.entity.IncomeEntity;
import com.ceic.mem.persistence.entity.OccupationEntity;
import com.ceic.mem.persistence.entity.PartnerPrefEntity;
import com.ceic.mem.persistence.entity.ProfessionalInfoEntity;
import com.ceic.mem.persistence.entity.ProfessionalPrefEntity;
import com.ceic.mem.persistence.entity.ReligionInfoEntity;
import com.ceic.mem.persistence.entity.UserBasicDetailEntity;
import com.ceic.mem.persistence.entity.UserLocationEntity;
import com.ceic.mem.persistence.entity.UserLoginEntity;
import com.ceic.mem.persistence.entity.UserProfileEntity;
import com.ceic.mem.persistence.entity.UserRegistrationEntity;
import com.ceic.mem.persistence.entity.UsersRelationEntity;
import com.ciec.mem.dto.CountryDTO;
import com.ciec.mem.dto.EmployeeDTO;
import com.ciec.mem.dto.FamilyDetailsDTO;
import com.ciec.mem.dto.IncomeDTO;
import com.ciec.mem.dto.OccupationDTO;
import com.ciec.mem.dto.PartnerPrefDTO;
import com.ciec.mem.dto.ProfessionalInfoDTO;
import com.ciec.mem.dto.ProfessionalPrefDTO;
import com.ciec.mem.dto.ReligionInfoDTO;
import com.ciec.mem.dto.UserBasicDetailDTO;
import com.ciec.mem.dto.UserLocationDTO;
import com.ciec.mem.dto.UserLoginDTO;
import com.ciec.mem.dto.UserProfileDTO;
import com.ciec.mem.dto.UserRegistrationDTO;
import com.ciec.mem.dto.UsersRelationDTO;

public class DtoToEntity {

	public static UserRegistrationEntity getUserRegistrationEntity(UserRegistrationDTO userRegistrationDTO) {
		UserRegistrationEntity userRegistrationEntity = new UserRegistrationEntity();
		userRegistrationEntity.setUserId(userRegistrationDTO.getUserId());
		userRegistrationEntity.setMobileNo(userRegistrationDTO.getMobileNo());
		userRegistrationEntity.setEmailId(userRegistrationDTO.getEmailId());
		userRegistrationEntity.setUserFor(userRegistrationDTO.getUserFor());
		userRegistrationEntity.setGender(userRegistrationDTO.getGender());
		userRegistrationEntity.setDob(userRegistrationDTO.getDob());
		userRegistrationEntity.setMotherTongue(userRegistrationDTO.getMotherTongue());
		userRegistrationEntity.setCastDivision(userRegistrationDTO.getCastDivision());
		userRegistrationEntity.setLivingCountry(userRegistrationDTO.getLivingCountry());
		userRegistrationEntity.setLoginPasword(userRegistrationDTO.getLoginPasword());
		userRegistrationEntity.setCreatedDate(userRegistrationDTO.getCreatedDate());
		userRegistrationEntity.setLastUpdateDate(userRegistrationDTO.getLastUpdateDate());
		userRegistrationEntity.setDeletedDate(userRegistrationDTO.getDeletedDate());

		return userRegistrationEntity;
	}

	public static UsersRelationEntity getUsersRelationEntity(UsersRelationDTO usersRelationDTO) {
		UsersRelationEntity usersRelationEntity = new UsersRelationEntity();
		usersRelationEntity.setFromUserId(usersRelationDTO.getFromUserId());
		usersRelationEntity.setToUserId(usersRelationDTO.getToUserId());
		usersRelationEntity.setViewProfile(usersRelationDTO.getViewProfile());
		usersRelationEntity.setViewProfileTime(usersRelationDTO.getViewProfileTime());
		usersRelationEntity.setLike(usersRelationDTO.getLike());
		usersRelationEntity.setLikeTime(usersRelationDTO.getLikeTime());
		usersRelationEntity.setSendRequest(usersRelationDTO.getSendRequest());
		usersRelationEntity.setSendRequestTime(usersRelationDTO.getSendRequestTime());
		usersRelationEntity.setAcceptRequest(usersRelationDTO.getAcceptRequest());
		usersRelationEntity.setAcceptRequestTime(usersRelationDTO.getAcceptRequestTime());
		usersRelationEntity.setViewMobile(usersRelationDTO.getViewMobile());
		usersRelationEntity.setViewMobileTime(usersRelationDTO.getViewMobileTime());
		usersRelationEntity.setViewEmail(usersRelationDTO.getViewEmail());
		usersRelationEntity.setViewEmailTime(usersRelationDTO.getViewMobileTime());
		usersRelationEntity.setSendMail(usersRelationDTO.getSendMail());
		usersRelationEntity.setSendMailTime(usersRelationDTO.getSendMailTime());
		usersRelationEntity.setBlock(usersRelationDTO.getBlock());
		usersRelationEntity.setMailContent(usersRelationDTO.getMailContent());
		usersRelationEntity.setRequestPicks(usersRelationDTO.getRequestPicks());
		usersRelationEntity.setRequestPicksTime(usersRelationDTO.getRequestPicksTime());
		usersRelationEntity.setRespondPicks(usersRelationDTO.getRespondPicks());//
		usersRelationEntity.setRespondPicksTime(usersRelationDTO.getRespondPicksTime());
		usersRelationEntity.setRequestFile(usersRelationDTO.getRequestFile());
		usersRelationEntity.setRequestFileTime(usersRelationDTO.getRequestFileTime());
		usersRelationEntity.setRespondFile(usersRelationDTO.getRespondFile());
		usersRelationEntity.setRespondFileTime(usersRelationDTO.getRespondFileTime());
		usersRelationEntity.setRequestHadoop(usersRelationDTO.getRequestHadoop());
		usersRelationEntity.setRequestHadoopTime(usersRelationDTO.getRequestHadoopTime());
		usersRelationEntity.setrespondHadoop(usersRelationDTO.getrespondHadoop());
		usersRelationEntity.setrespondHadoopTime(usersRelationDTO.getrespondHadoopTime());
		return usersRelationEntity;
	}

	public static UserProfileEntity getUserProfileEntity(UserProfileDTO userProfileDTO) {
		UserProfileEntity userProfileEntity = new UserProfileEntity();
		userProfileEntity.setUserId(userProfileDTO.getUserId());
		userProfileEntity.setName(userProfileDTO.getName());
		userProfileEntity.setProfileFor(userProfileDTO.getProfileFor());
		userProfileEntity.setAge(userProfileDTO.getAge());
		userProfileEntity.setHeight(userProfileDTO.getHeight());
		userProfileEntity.setReligion(userProfileDTO.getReligion());
		userProfileEntity.setCast(userProfileDTO.getCast());
		userProfileEntity.setSubcast(userProfileDTO.getSubcast());
		userProfileEntity.setLocation(userProfileDTO.getLocation());
		userProfileEntity.setEducation(userProfileDTO.getEducation());
		userProfileEntity.setProfession(userProfileDTO.getProfession());
		userProfileEntity.setAnnualIncome(userProfileDTO.getAnnualIncome());
		userProfileEntity.setMonthlyIncome(userProfileDTO.getMonthlyIncome());
		userProfileEntity.setDescription(userProfileDTO.getDescription());
		userProfileEntity.setCreatedDate(userProfileDTO.getCreatedDate());
		userProfileEntity.setLastUpdateDate(userProfileDTO.getLastUpdateDate());
		return userProfileEntity;
	}

	public static UserLoginEntity getUserLoginEntity(UserLoginDTO userLoginDTO) {
		UserLoginEntity userLoginEntity = new UserLoginEntity();
		userLoginEntity.setUserId(userLoginDTO.getUserId());
		userLoginEntity.setEmailId(userLoginDTO.getEmailId());
		userLoginEntity.setMobileNo(userLoginDTO.getMobileNo());
		userLoginEntity.setUserStatus(userLoginDTO.getUserStatus());
		userLoginEntity.setLoginStatus(userLoginDTO.getLoginStatus());
		userLoginEntity.setLoginTime(userLoginDTO.getLoginTime());
		userLoginEntity.setLogoutTime(userLoginDTO.getLogoutTime());

		return userLoginEntity;
	}

	public static UserLocationEntity getUserLocationEntity(UserLocationDTO userLocationDTO) {
		UserLocationEntity userLocationEntity = new UserLocationEntity();
		userLocationEntity.setUserId(userLocationDTO.getUserId());
		userLocationEntity.setCity(userLocationDTO.getCity());
		userLocationEntity.setState(userLocationDTO.getState());
		userLocationEntity.setCountry(userLocationDTO.getCountry());
		userLocationEntity.setCitizenship(userLocationDTO.getCitizenship());

		return userLocationEntity;
	}

	public static UserBasicDetailEntity getUserBasicDetailEntity(UserBasicDetailDTO userBasicDetailDTO) {
		UserBasicDetailEntity userBasicDetailEntity = new UserBasicDetailEntity();
		userBasicDetailEntity.setUserId(userBasicDetailDTO.getUserId());
		userBasicDetailEntity.setProfileFor(userBasicDetailDTO.getProfileFor());
		userBasicDetailEntity.setName(userBasicDetailDTO.getName());
		userBasicDetailEntity.setBodyTypeComplexion(userBasicDetailDTO.getBodyTypeComplexion());
		userBasicDetailEntity.setAge(userBasicDetailDTO.getAge());
		userBasicDetailEntity.setPhysicalStatus(userBasicDetailDTO.getPhysicalStatus());
		userBasicDetailEntity.setHeight(userBasicDetailDTO.getHeight());
		userBasicDetailEntity.setWeight(userBasicDetailDTO.getWeight());
		userBasicDetailEntity.setMotherTongue(userBasicDetailDTO.getMotherTongue());
		userBasicDetailEntity.setMaritalStatus(userBasicDetailDTO.getMaritalStatus());
		userBasicDetailEntity.setEatingHabits(userBasicDetailDTO.getEatingHabits());
		userBasicDetailEntity.setDrinkingHabits(userBasicDetailDTO.getDrinkingHabits());
		userBasicDetailEntity.setSmokingHabits(userBasicDetailDTO.getSmokingHabits());

		return userBasicDetailEntity;
	}

	public static ReligionInfoEntity getReligionInfoEntity(ReligionInfoDTO religionInfoDTO) {
		ReligionInfoEntity religionInfoEntity = new ReligionInfoEntity();

		religionInfoEntity.setUserId(religionInfoDTO.getUserId());
		religionInfoEntity.setReligion(religionInfoDTO.getReligion());
		religionInfoEntity.setCastSubcaste(religionInfoDTO.getCastSubcaste());
		religionInfoEntity.setGothrams(religionInfoDTO.getGothrams());
		religionInfoEntity.setStarRassi(religionInfoDTO.getStarRassi());
		religionInfoEntity.setDosh(religionInfoDTO.getDosh());
		religionInfoEntity.setUnknown1(religionInfoDTO.getUnknown1());
		religionInfoEntity.setUnknown2(religionInfoDTO.getUnknown2());

		return religionInfoEntity;
	}

	public static ProfessionalPrefEntity getProfessionalPrefEntity(ProfessionalPrefDTO professionalPrefDTO) {
		ProfessionalPrefEntity professionalPrefEntity = new ProfessionalPrefEntity();

		professionalPrefEntity.setUserId(professionalPrefDTO.getUserId());
		professionalPrefEntity.setEducation(professionalPrefDTO.getEducation());
		professionalPrefEntity.setOccupation(professionalPrefDTO.getOccupation());
		professionalPrefEntity.setAnnualIncome(professionalPrefDTO.getAnnualIncome());
		professionalPrefEntity.setUnknown(professionalPrefDTO.getUnknown());
		return professionalPrefEntity;
	}

	public static ProfessionalInfoEntity getProfessionalInfoEntity(ProfessionalInfoDTO professionalInfoDTO) {
		ProfessionalInfoEntity professionalInfoEntity = new ProfessionalInfoEntity();

		professionalInfoEntity.setUserId(professionalInfoDTO.getUserId());
		professionalInfoEntity.setEducation(professionalInfoDTO.getEducation());
		professionalInfoEntity.setCollegeInstitution(professionalInfoDTO.getCollegeInstitution());
		professionalInfoEntity.setEducationDetail(professionalInfoDTO.getEducationDetail());
		professionalInfoEntity.setOccupation(professionalInfoDTO.getOccupation());
		professionalInfoEntity.setOccupationDetail(professionalInfoDTO.getOccupationDetail());
		professionalInfoEntity.setEmployeeIn(professionalInfoDTO.getEmployeeIn());
		professionalInfoEntity.setAnnualIncome(professionalInfoDTO.getAnnualIncome());
		professionalInfoEntity.setMonthlyIncome(professionalInfoDTO.getMonthlyIncome());
		professionalInfoEntity.setUnknown(professionalInfoDTO.getUnknown());

		return professionalInfoEntity;
	}

	public static PartnerPrefEntity getPartnerPrefEntity(PartnerPrefDTO partnerPrefDTO) {
		PartnerPrefEntity partnerPrefEntity = new PartnerPrefEntity();

		partnerPrefEntity.setUserId(partnerPrefDTO.getUserId());
		partnerPrefEntity.setAgeFrom(partnerPrefDTO.getAgeFrom());
		partnerPrefEntity.setAgeTo(partnerPrefDTO.getAgeTo());
		partnerPrefEntity.setMaritalStatus(partnerPrefDTO.getMaritalStatus());
		partnerPrefEntity.setPhysicalStatus(partnerPrefDTO.getPhysicalStatus());
		partnerPrefEntity.setEatingHabits(partnerPrefDTO.getEatingHabits());
		partnerPrefEntity.setSmokingHabits(partnerPrefDTO.getSmokingHabits());
		partnerPrefEntity.setDrinkingHabits(partnerPrefDTO.getDrinkingHabits());
		partnerPrefEntity.setMotherTongue(partnerPrefDTO.getMotherTongue());
		partnerPrefEntity.setCaste(partnerPrefDTO.getCaste());
		partnerPrefEntity.setStar(partnerPrefDTO.getStar());
		partnerPrefEntity.setManglik(partnerPrefDTO.getManglik());
		partnerPrefEntity.setUnknown(partnerPrefDTO.getUnknown());

		return partnerPrefEntity;
	}

	public static OccupationEntity getOccupationEntity(OccupationDTO occupationDTO) {
		OccupationEntity occupationEntity = new OccupationEntity();

		if (occupationDTO.getId() != null)
			occupationEntity.setId(occupationDTO.getId());
		occupationEntity.setOccupation(occupationDTO.getOccupation());

		return occupationEntity;
	}

	public static IncomeEntity getIncomeEntity(IncomeDTO incomeDTO) {
		IncomeEntity incomeEntity = new IncomeEntity();

		if (incomeDTO.getId() != null)
			incomeEntity.setId(incomeDTO.getId());
		incomeEntity.setMonthly(incomeDTO.getMonthly());
		incomeEntity.setYearly(incomeDTO.getYearly());

		return incomeEntity;
	}

	public static FamilyDetailsEntity getFamilyDetailsEntity(FamilyDetailsDTO familyDetailsDTO) {
		FamilyDetailsEntity familyDetailsEntity = new FamilyDetailsEntity();

		familyDetailsEntity.setUserId(familyDetailsDTO.getUserId());
		familyDetailsEntity.setFatherStatus(familyDetailsDTO.getFatherStatus());
		familyDetailsEntity.setFamilyValue(familyDetailsDTO.getFamilyValue());
		familyDetailsEntity.setMotherStatus(familyDetailsDTO.getMotherStatus());
		familyDetailsEntity.setFamilyType(familyDetailsDTO.getFamilyType());
		familyDetailsEntity.setNoOfBorhers(familyDetailsDTO.getNoOfBorhers());
		familyDetailsEntity.setFamilyStatus(familyDetailsDTO.getFamilyStatus());
		familyDetailsEntity.setNoOfSisters(familyDetailsDTO.getNoOfSisters());
		familyDetailsEntity.setAboutFaimly(familyDetailsDTO.getAboutFaimly());
		familyDetailsEntity.setUnkonwn(familyDetailsDTO.getUnkonwn());

		return familyDetailsEntity;
	}

	public static EmployeeEntity getEmployeeEntity(EmployeeDTO employeeDTO) {
		EmployeeEntity employeeEntity = new EmployeeEntity();

		if (employeeDTO.getId() != null)
			employeeEntity.setId(employeeDTO.getId());
		employeeEntity.setEmployee(employeeDTO.getEmployee());

		return employeeEntity;
	}

	public static CountryEntity getCountryEntity(CountryDTO countryDTO) {
		CountryEntity countryEntity = new CountryEntity();

		if (countryDTO.getId() != null)
			countryEntity.setId(countryDTO.getId());
		countryEntity.setCountryCode(countryDTO.getCountryCode());
		countryEntity.setCountryName(countryDTO.getCountryName());

		return countryEntity;
	}

}
