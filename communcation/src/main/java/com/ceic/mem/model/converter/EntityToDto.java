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

public class EntityToDto {

	public static UserRegistrationDTO getUserRegistrationDTO(UserRegistrationEntity entity) {
		UserRegistrationDTO userRegistrationDto = new UserRegistrationDTO();
		userRegistrationDto.setUserId(entity.getUserId());
		userRegistrationDto.setMobileNo(entity.getMobileNo());
		userRegistrationDto.setEmailId(entity.getEmailId());
		userRegistrationDto.setUserFor(entity.getUserFor());
		userRegistrationDto.setGender(entity.getGender());
		userRegistrationDto.setDob(entity.getDob());
		userRegistrationDto.setMotherTongue(entity.getMotherTongue());
		userRegistrationDto.setCastDivision(entity.getCastDivision());
		userRegistrationDto.setLivingCountry(entity.getLivingCountry());
		userRegistrationDto.setLoginPasword(entity.getLoginPasword());
		userRegistrationDto.setCreatedDate(entity.getCreatedDate());
		userRegistrationDto.setLastUpdateDate(entity.getLastUpdateDate());
		userRegistrationDto.setDeletedDate(entity.getDeletedDate());

		return userRegistrationDto;
	}

	public static UsersRelationDTO getUsersRelationDTO(UsersRelationEntity usersRelationEntity) {
		UsersRelationDTO usersRelationDTO = new UsersRelationDTO();
		usersRelationDTO.setFromUserId(usersRelationEntity.getFromUserId());
		usersRelationDTO.setToUserId(usersRelationEntity.getToUserId());
		usersRelationDTO.setViewProfile(usersRelationEntity.getViewProfile());
		usersRelationDTO.setViewProfileTime(usersRelationEntity.getViewProfileTime());
		usersRelationDTO.setLike(usersRelationEntity.getLike());
		usersRelationDTO.setLikeTime(usersRelationEntity.getLikeTime());
		usersRelationDTO.setSendRequest(usersRelationEntity.getSendRequest());
		usersRelationDTO.setSendRequestTime(usersRelationEntity.getSendRequestTime());
		usersRelationDTO.setAcceptRequest(usersRelationEntity.getAcceptRequest());
		usersRelationDTO.setAcceptRequestTime(usersRelationEntity.getAcceptRequestTime());
		usersRelationDTO.setViewMobile(usersRelationEntity.getViewMobile());
		usersRelationDTO.setViewMobileTime(usersRelationEntity.getViewMobileTime());
		usersRelationDTO.setViewEmail(usersRelationEntity.getViewEmail());
		usersRelationDTO.setViewEmailTime(usersRelationEntity.getViewMobileTime());
		usersRelationDTO.setSendMail(usersRelationEntity.getSendMail());
		usersRelationDTO.setSendMailTime(usersRelationEntity.getSendMailTime());
		usersRelationDTO.setBlock(usersRelationEntity.getBlock());
		usersRelationDTO.setMailContent(usersRelationEntity.getMailContent());
		usersRelationDTO.setRequestPicks(usersRelationEntity.getRequestPicks());
		usersRelationDTO.setRequestPicksTime(usersRelationEntity.getRequestPicksTime());
		usersRelationDTO.setRespondPicks(usersRelationEntity.getRespondPicks());
		usersRelationDTO.setRequestFile(usersRelationEntity.getRequestFile());
		usersRelationDTO.setRequestFileTime(usersRelationEntity.getRequestFileTime());
		usersRelationDTO.setRespondFile(usersRelationEntity.getRespondFile());
		usersRelationDTO.setRespondFileTime(usersRelationEntity.getRespondFileTime());
		usersRelationDTO.setRequestHadoop(usersRelationEntity.getRequestHadoop());
		usersRelationDTO.setRequestHadoopTime(usersRelationEntity.getRequestHadoopTime());
		usersRelationDTO.setrespondHadoop(usersRelationEntity.getrespondHadoop());
		usersRelationDTO.setrespondHadoopTime(usersRelationEntity.getRequestHadoopTime());
		return usersRelationDTO;
	}

	public static UserProfileDTO getUserProfileDTO(UserProfileEntity userProfileEntity) {
		UserProfileDTO userProfileDTO = new UserProfileDTO();
		userProfileDTO.setUserId(userProfileEntity.getUserId());
		userProfileDTO.setName(userProfileEntity.getName());
		userProfileDTO.setProfileFor(userProfileEntity.getProfileFor());
		userProfileDTO.setAge(userProfileEntity.getAge());
		userProfileDTO.setHeight(userProfileEntity.getHeight());
		userProfileDTO.setReligion(userProfileEntity.getReligion());
		userProfileDTO.setCast(userProfileEntity.getCast());
		userProfileDTO.setSubcast(userProfileEntity.getSubcast());
		userProfileDTO.setLocation(userProfileEntity.getLocation());
		userProfileDTO.setEducation(userProfileEntity.getEducation());
		userProfileDTO.setProfession(userProfileEntity.getProfession());
		userProfileDTO.setAnnualIncome(userProfileEntity.getAnnualIncome());
		userProfileDTO.setMonthlyIncome(userProfileEntity.getMonthlyIncome());
		userProfileDTO.setDescription(userProfileEntity.getDescription());
		userProfileDTO.setCreatedDate(userProfileEntity.getCreatedDate());
		userProfileDTO.setLastUpdateDate(userProfileEntity.getLastUpdateDate());
		return userProfileDTO;
	}

	public static UserLoginDTO getUserLoginDTO(UserLoginEntity userLoginEntity) {
		UserLoginDTO userLoginDTO = new UserLoginDTO();
		userLoginDTO.setUserId(userLoginEntity.getUserId());
		userLoginDTO.setEmailId(userLoginEntity.getEmailId());
		userLoginDTO.setMobileNo(userLoginEntity.getMobileNo());
		userLoginDTO.setUserStatus(userLoginEntity.getUserStatus());
		userLoginDTO.setLoginStatus(userLoginEntity.getLoginStatus());
		userLoginDTO.setLoginTime(userLoginEntity.getLoginTime());
		userLoginDTO.setLogoutTime(userLoginEntity.getLogoutTime());

		return userLoginDTO;
	}

	public static UserLocationDTO getUserLocationDTO(UserLocationEntity userLocationEntity) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserId(userLocationEntity.getUserId());
		userLocationDTO.setCity(userLocationEntity.getCity());
		userLocationDTO.setState(userLocationEntity.getState());
		userLocationDTO.setCountry(userLocationEntity.getCountry());
		userLocationDTO.setCitizenship(userLocationEntity.getCitizenship());

		return userLocationDTO;
	}

	public static UserBasicDetailDTO getUserBasicDetailDTO(UserBasicDetailEntity userBasicDetailEntity) {
		UserBasicDetailDTO userBasicDetailDTO = new UserBasicDetailDTO();
		userBasicDetailDTO.setUserId(userBasicDetailEntity.getUserId());
		userBasicDetailDTO.setProfileFor(userBasicDetailEntity.getProfileFor());
		userBasicDetailDTO.setName(userBasicDetailEntity.getName());
		userBasicDetailDTO.setBodyTypeComplexion(userBasicDetailEntity.getBodyTypeComplexion());
		userBasicDetailDTO.setAge(userBasicDetailEntity.getAge());
		userBasicDetailDTO.setPhysicalStatus(userBasicDetailEntity.getPhysicalStatus());
		userBasicDetailDTO.setHeight(userBasicDetailEntity.getHeight());
		userBasicDetailDTO.setWeight(userBasicDetailEntity.getWeight());
		userBasicDetailDTO.setMotherTongue(userBasicDetailEntity.getMotherTongue());
		userBasicDetailDTO.setMaritalStatus(userBasicDetailEntity.getMaritalStatus());
		userBasicDetailDTO.setEatingHabits(userBasicDetailEntity.getEatingHabits());
		userBasicDetailDTO.setDrinkingHabits(userBasicDetailEntity.getDrinkingHabits());
		userBasicDetailDTO.setSmokingHabits(userBasicDetailEntity.getSmokingHabits());

		return userBasicDetailDTO;
	}

	public static ReligionInfoDTO getReligionInfoDTO(ReligionInfoEntity religionInfoEntity) {
		ReligionInfoDTO ReligionInfoDTO = new ReligionInfoDTO();

		ReligionInfoDTO.setUserId(religionInfoEntity.getUserId());
		ReligionInfoDTO.setReligion(religionInfoEntity.getReligion());
		ReligionInfoDTO.setCastSubcaste(religionInfoEntity.getCastSubcaste());
		ReligionInfoDTO.setGothrams(religionInfoEntity.getGothrams());
		ReligionInfoDTO.setStarRassi(religionInfoEntity.getStarRassi());
		ReligionInfoDTO.setDosh(religionInfoEntity.getDosh());
		ReligionInfoDTO.setUnknown1(religionInfoEntity.getUnknown1());
		ReligionInfoDTO.setUnknown2(religionInfoEntity.getUnknown2());

		return ReligionInfoDTO;
	}

	public static ProfessionalPrefDTO getProfessionalPrefDTO(ProfessionalPrefEntity professionalPrefEntity) {
		ProfessionalPrefDTO professionalPrefDTO = new ProfessionalPrefDTO();

		professionalPrefDTO.setUserId(professionalPrefEntity.getUserId());
		professionalPrefDTO.setEducation(professionalPrefEntity.getEducation());
		professionalPrefDTO.setOccupation(professionalPrefEntity.getOccupation());
		professionalPrefDTO.setAnnualIncome(professionalPrefEntity.getAnnualIncome());
		professionalPrefDTO.setUnknown(professionalPrefEntity.getUnknown());

		return professionalPrefDTO;
	}

	public static ProfessionalInfoDTO getProfessionalInfoDTO(ProfessionalInfoEntity professionalInfoEntity) {
		ProfessionalInfoDTO professionalInfoDTO = new ProfessionalInfoDTO();

		professionalInfoDTO.setUserId(professionalInfoEntity.getUserId());
		professionalInfoDTO.setEducation(professionalInfoEntity.getEducation());
		professionalInfoDTO.setCollegeInstitution(professionalInfoEntity.getCollegeInstitution());
		professionalInfoDTO.setEducationDetail(professionalInfoEntity.getEducationDetail());
		professionalInfoDTO.setOccupation(professionalInfoEntity.getOccupation());
		professionalInfoDTO.setOccupationDetail(professionalInfoEntity.getOccupationDetail());
		professionalInfoDTO.setEmployeeIn(professionalInfoEntity.getEmployeeIn());
		professionalInfoDTO.setAnnualIncome(professionalInfoEntity.getAnnualIncome());
		professionalInfoDTO.setMonthlyIncome(professionalInfoEntity.getMonthlyIncome());
		professionalInfoDTO.setUnknown(professionalInfoEntity.getUnknown());

		return professionalInfoDTO;
	}

	public static PartnerPrefDTO getPartnerPrefDTO(PartnerPrefEntity partnerPrefEntity) {
		PartnerPrefDTO partnerPrefDTO = new PartnerPrefDTO();

		partnerPrefDTO.setUserId(partnerPrefEntity.getUserId());
		partnerPrefDTO.setAgeFrom(partnerPrefEntity.getAgeFrom());
		partnerPrefDTO.setAgeTo(partnerPrefEntity.getAgeTo());
		partnerPrefDTO.setMaritalStatus(partnerPrefEntity.getMaritalStatus());
		partnerPrefDTO.setPhysicalStatus(partnerPrefEntity.getPhysicalStatus());
		partnerPrefDTO.setEatingHabits(partnerPrefEntity.getEatingHabits());
		partnerPrefDTO.setSmokingHabits(partnerPrefEntity.getSmokingHabits());
		partnerPrefDTO.setDrinkingHabits(partnerPrefEntity.getDrinkingHabits());
		partnerPrefDTO.setMotherTongue(partnerPrefEntity.getMotherTongue());
		partnerPrefDTO.setCaste(partnerPrefEntity.getCaste());
		partnerPrefDTO.setStar(partnerPrefEntity.getStar());
		partnerPrefDTO.setManglik(partnerPrefEntity.getManglik());
		partnerPrefDTO.setUnknown(partnerPrefEntity.getUnknown());

		return partnerPrefDTO;
	}

	public static OccupationDTO getOccupationDTO(OccupationEntity occupationEntity) {
		OccupationDTO occupationDTO = new OccupationDTO();

		occupationDTO.setId(occupationEntity.getId());
		occupationDTO.setOccupation(occupationEntity.getOccupation());

		return occupationDTO;
	}

	public static IncomeDTO getIncomeDTO(IncomeEntity incomeEntity) {
		IncomeDTO incomeDTO = new IncomeDTO();

		incomeDTO.setId(incomeEntity.getId());
		incomeDTO.setMonthly(incomeEntity.getMonthly());
		incomeDTO.setYearly(incomeEntity.getYearly());

		return incomeDTO;
	}

	public static FamilyDetailsDTO getFamilyDetailsDTO(FamilyDetailsEntity familyDetailsEntity) {
		FamilyDetailsDTO familyDetailsDTO = new FamilyDetailsDTO();

		familyDetailsDTO.setUserId(familyDetailsEntity.getUserId());
		familyDetailsDTO.setFatherStatus(familyDetailsEntity.getFatherStatus());
		familyDetailsDTO.setFamilyValue(familyDetailsEntity.getFamilyValue());
		familyDetailsDTO.setMotherStatus(familyDetailsEntity.getMotherStatus());
		familyDetailsDTO.setFamilyType(familyDetailsEntity.getFamilyType());
		familyDetailsDTO.setNoOfBorhers(familyDetailsEntity.getNoOfBorhers());
		familyDetailsDTO.setFamilyStatus(familyDetailsEntity.getFamilyStatus());
		familyDetailsDTO.setNoOfSisters(familyDetailsEntity.getNoOfSisters());
		familyDetailsDTO.setAboutFaimly(familyDetailsEntity.getAboutFaimly());
		familyDetailsDTO.setUnkonwn(familyDetailsEntity.getUnkonwn());

		return familyDetailsDTO;
	}

	public static EmployeeDTO getEmployeeDTO(EmployeeEntity employeeEntity) {
		EmployeeDTO employeeDTO = new EmployeeDTO();

		employeeDTO.setId(employeeEntity.getId());
		employeeDTO.setEmployee(employeeEntity.getEmployee());

		return employeeDTO;
	}

	public static CountryDTO getCountryDTO(CountryEntity countryEntity) {
		CountryDTO countryDTO = new CountryDTO();

		countryDTO.setId(countryEntity.getId());
		countryDTO.setCountryCode(countryEntity.getCountryCode());
		countryDTO.setCountryName(countryEntity.getCountryName());

		return countryDTO;
	}
}
