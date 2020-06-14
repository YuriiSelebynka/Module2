/*
 *
 * Classame : Java Development (K)
 *
 *  13 June 2020
 *
 * Created by Selebynka Yurii (UzhNU)
 *
 *  Programming patterns. Factory. Builder.
 *
 *    Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student.
 *
 * */

package com.company;

import java.time.LocalDate;
import java.util.Objects;

        // 3. Create a class Student  - 25 fields.
    /*Here we create class Student. In my version it has 35 fields.*/

public class Student {


    private String FirstName;
    private String SurName;
    private String Patronymic;
    private LocalDate birthday;
    private String Gender;
    private String IdentityDocument;
    private String PhoneNumber;
    private String EMailAddress;
    public boolean isAdult;
    private boolean isMilitary;
    private String Persuasion;
    private boolean isPrivileged;
    private String KnowledgeOfForeignLanguages;
    private int CertificateMark;
    private int UALanguageZNOResults;
    private int EnglishLanguageZNOResults;
    private int HistoryZNOResults;
    private boolean IsStateEmployee;
    private boolean isScholar;
    private int StudentTicketNumber;
    private int CreditBookNumber;
    private String Speciality;
    private String Chair;
    private String EducationLevel;
    private boolean isReTakesTheExams;
    private String TitleOfThesis;
    private String Supervisor;
    private String SpecialCourses;
    private int NumberOfConferences;
    private int NumberOfScientificArticles;
    private boolean ParticipationInLegalClinic;
    private boolean IsSportsActivist;
    private boolean IsArtActivist;
    private String SpecialAwards;
    private String Notes;

        // 3. Create a class Student  - 25 fields.
    /*Here we create Constructor for class Student.*/

    public Student(String firstName,
                   String surName,
                   String patronymic,
                   LocalDate birthday,
                   String gender,
                   String identityDocument,
                   String phoneNumber,
                   String EMailAddress,
                   boolean isAdult,
                   boolean isMilitary,
                   String persuasion,
                   boolean isPrivileged,
                   String knowledgeOfForeignLanguages,
                   int certificateMark,
                   int UALanguageZNOResults,
                   int englishLanguageZNOResults,
                   int historyZNOResults,
                   boolean isStateEmployee,
                   boolean isScholar,
                   int studentTicketNumber,
                   int creditBookNumber,
                   String speciality,
                   String chair,
                   String educationLevel,
                   boolean isReTakesTheExams,
                   String titleOfThesis,
                   String supervisor,
                   String specialCourses,
                   int numberOfConferences,
                   int numberOfScientificArticles,
                   boolean participationInLegalClinic,
                   boolean isSportsActivist,
                   boolean isArtActivist,
                   String specialAwards,
                   String notes) {
        FirstName = firstName;
        SurName = surName;
        Patronymic = patronymic;
        this.birthday = birthday;
        Gender = gender;
        IdentityDocument = identityDocument;
        PhoneNumber = phoneNumber;
        this.EMailAddress = EMailAddress;
        this.isAdult = isAdult;
        this.isMilitary = isMilitary;
        Persuasion = persuasion;
        this.isPrivileged = isPrivileged;
        KnowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
        CertificateMark = certificateMark;
        this.UALanguageZNOResults = UALanguageZNOResults;
        EnglishLanguageZNOResults = englishLanguageZNOResults;
        HistoryZNOResults = historyZNOResults;
        IsStateEmployee = isStateEmployee;
        this.isScholar = isScholar;
        StudentTicketNumber = studentTicketNumber;
        CreditBookNumber = creditBookNumber;
        Speciality = speciality;
        Chair = chair;
        EducationLevel = educationLevel;
        this.isReTakesTheExams = isReTakesTheExams;
        TitleOfThesis = titleOfThesis;
        Supervisor = supervisor;
        SpecialCourses = specialCourses;
        NumberOfConferences = numberOfConferences;
        NumberOfScientificArticles = numberOfScientificArticles;
        ParticipationInLegalClinic = participationInLegalClinic;
        IsSportsActivist = isSportsActivist;
        IsArtActivist = isArtActivist;
        SpecialAwards = specialAwards;
        Notes = notes;
    }

    public Student() {

    }

        // 3. Create a class Student  - 25 fields.
    /*Here we create Getters and Setters for class Student.*/

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getIdentityDocument() {
        return IdentityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        IdentityDocument = identityDocument;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEMailAddress() {
        return EMailAddress;
    }

    public void setEMailAddress(String EMailAddress) {
        this.EMailAddress = EMailAddress;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public String getPersuasion() {
        return Persuasion;
    }

    public void setPersuasion(String persuasion) {
        Persuasion = persuasion;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public String getKnowledgeOfForeignLanguages() {
        return KnowledgeOfForeignLanguages;
    }

    public void setKnowledgeOfForeignLanguages(String knowledgeOfForeignLanguages) {
        KnowledgeOfForeignLanguages = knowledgeOfForeignLanguages;
    }

    public int getCertificateMark() {
        return CertificateMark;
    }

    public void setCertificateMark(int certificateMark) {
        CertificateMark = certificateMark;
    }

    public int getUALanguageZNOResults() {
        return UALanguageZNOResults;
    }

    public void setUALanguageZNOResults(int UALanguageZNOResults) {
        this.UALanguageZNOResults = UALanguageZNOResults;
    }

    public int getEnglishLanguageZNOResults() {
        return EnglishLanguageZNOResults;
    }

    public void setEnglishLanguageZNOResults(int englishLanguageZNOResults) {
        EnglishLanguageZNOResults = englishLanguageZNOResults;
    }

    public int getHistoryZNOResults() {
        return HistoryZNOResults;
    }

    public void setHistoryZNOResults(int historyZNOResults) {
        HistoryZNOResults = historyZNOResults;
    }

    public boolean isStateEmployee() {
        return IsStateEmployee;
    }

    public void setStateEmployee(boolean stateEmployee) {
        IsStateEmployee = stateEmployee;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public void setScholar(boolean scholar) {
        isScholar = scholar;
    }

    public int getStudentTicketNumber() {
        return StudentTicketNumber;
    }

    public void setStudentTicketNumber(int studentTicketNumber) {
        StudentTicketNumber = studentTicketNumber;
    }

    public int getCreditBookNumber() {
        return CreditBookNumber;
    }

    public void setCreditBookNumber(int creditBookNumber) {
        CreditBookNumber = creditBookNumber;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getChair() {
        return Chair;
    }

    public void setChair(String chair) {
        Chair = chair;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        EducationLevel = educationLevel;
    }

    public boolean isReTakesTheExams() {
        return isReTakesTheExams;
    }

    public void setReTakesTheExams(boolean reTakesTheExams) {
        isReTakesTheExams = reTakesTheExams;
    }

    public String getTitleOfThesis() {
        return TitleOfThesis;
    }

    public void setTitleOfThesis(String titleOfThesis) {
        TitleOfThesis = titleOfThesis;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public String getSpecialCourses() {
        return SpecialCourses;
    }

    public void setSpecialCourses(String specialCourses) {
        SpecialCourses = specialCourses;
    }

    public int getNumberOfConferences() {
        return NumberOfConferences;
    }

    public void setNumberOfConferences(int numberOfConferences) {
        NumberOfConferences = numberOfConferences;
    }

    public int getNumberOfScientificArticles() {
        return NumberOfScientificArticles;
    }

    public void setNumberOfScientificArticles(int numberOfScientificArticles) {
        NumberOfScientificArticles = numberOfScientificArticles;
    }

    public boolean isParticipationInLegalClinic() {
        return ParticipationInLegalClinic;
    }

    public void setParticipationInLegalClinic(boolean participationInLegalClinic) {
        ParticipationInLegalClinic = participationInLegalClinic;
    }

    public boolean isSportsActivist() {
        return IsSportsActivist;
    }

    public void setSportsActivist(boolean sportsActivist) {
        IsSportsActivist = sportsActivist;
    }

    public boolean isArtActivist() {
        return IsArtActivist;
    }

    public void setArtActivist(boolean artActivist) {
        IsArtActivist = artActivist;
    }

    public String getSpecialAwards() {
        return SpecialAwards;
    }

    public void setSpecialAwards(String specialAwards) {
        SpecialAwards = specialAwards;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

        // 3. Create a class Student  - 25 fields.
    /*Here we create method toString for class Student.*/

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", SurName='" + SurName + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                "," + '\n' + "birthday=" + birthday +
                ", Gender='" + Gender + '\'' +
                "," + '\n' + "IdentityDocument='" + IdentityDocument +
                ","+ '\n' + "PhoneNumber='" + PhoneNumber + '\'' +
                ", EMailAddress='" + EMailAddress + '\'' +
                "," + '\n' + "isAdult=" + isAdult +
                ", isMilitary=" + isMilitary +
                ", Persuasion='" + Persuasion + '\'' +
                ", isPrivileged=" + isPrivileged +
                "," + '\n' + "KnowledgeOfForeignLanguages='" +
                KnowledgeOfForeignLanguages + '\'' +
                ", CertificateMark=" + CertificateMark +
                ", UALanguageZNOResults=" + UALanguageZNOResults +
                ", EnglishLanguageZNOResults=" + EnglishLanguageZNOResults +
                ", HistoryZNOResults=" + HistoryZNOResults +
                "," + '\n' + "IsStateEmployee=" + IsStateEmployee +
                ", isScholar=" + isScholar +
                ", StudentTicketNumber=" + StudentTicketNumber +
                ", CreditBookNumber=" + CreditBookNumber +
                "," + '\n' + "Speciality='" + Speciality + '\'' +
                ", Chair='" + Chair + '\'' +
                ", EducationLevel='" + EducationLevel + '\'' +
                ", isReTakesTheExams=" + isReTakesTheExams +
                "," + '\n' + "TitleOfThesis='" + TitleOfThesis + '\'' +
                ", Supervisor='" + Supervisor + '\'' +
                ", SpecialCourses='" + SpecialCourses + '\'' +
                "," + '\n' + "NumberOfConferences=" + NumberOfConferences +
                ", NumberOfScientificArticles=" + NumberOfScientificArticles +
                ", ParticipationInLegalClinic=" + ParticipationInLegalClinic +
                ", IsSportsActivist=" + IsSportsActivist +
                ", IsArtActivist=" + IsArtActivist +
                ", SpecialAwards='" + SpecialAwards + '\'' +
                ", Notes='" + Notes + '\''  +
                '}' + '\n';
    }

        // 3. Create a class Student  - 25 fields.
    /*Here we create method equals for class Student.*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isAdult() == student.isAdult() &&
                isMilitary() == student.isMilitary() &&
                isPrivileged() == student.isPrivileged() &&
                getCertificateMark() == student.getCertificateMark() &&
                getUALanguageZNOResults() == student.getUALanguageZNOResults() &&
                getEnglishLanguageZNOResults() == student.getEnglishLanguageZNOResults() &&
                getHistoryZNOResults() == student.getHistoryZNOResults() &&
                isStateEmployee() == student.isStateEmployee() &&
                isScholar() == student.isScholar() &&
                getStudentTicketNumber() == student.getStudentTicketNumber() &&
                getCreditBookNumber() == student.getCreditBookNumber() &&
                isReTakesTheExams() == student.isReTakesTheExams() &&
                getNumberOfConferences() == student.getNumberOfConferences() &&
                getNumberOfScientificArticles() == student.getNumberOfScientificArticles() &&
                isParticipationInLegalClinic() == student.isParticipationInLegalClinic() &&
                isSportsActivist() == student.isSportsActivist() &&
                isArtActivist() == student.isArtActivist() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getSurName(), student.getSurName()) &&
                Objects.equals(getPatronymic(), student.getPatronymic()) &&
                Objects.equals(getBirthday(), student.getBirthday()) &&
                Objects.equals(getGender(), student.getGender()) &&
                Objects.equals(getIdentityDocument(), student.getIdentityDocument()) &&
                Objects.equals(getPhoneNumber(), student.getPhoneNumber()) &&
                Objects.equals(getEMailAddress(), student.getEMailAddress()) &&
                Objects.equals(getPersuasion(), student.getPersuasion()) &&
                Objects.equals(getKnowledgeOfForeignLanguages(), student.getKnowledgeOfForeignLanguages()) &&
                Objects.equals(getSpeciality(), student.getSpeciality()) &&
                Objects.equals(getChair(), student.getChair()) &&
                Objects.equals(getEducationLevel(), student.getEducationLevel()) &&
                Objects.equals(getTitleOfThesis(), student.getTitleOfThesis()) &&
                Objects.equals(getSupervisor(), student.getSupervisor()) &&
                Objects.equals(getSpecialCourses(), student.getSpecialCourses()) &&
                Objects.equals(getSpecialAwards(), student.getSpecialAwards()) &&
                Objects.equals(getNotes(), student.getNotes());
    }

        // 3. Create a class Student  - 25 fields.
    /*Here we create method hashCode for class Student.*/


    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSurName(), getPatronymic(), getBirthday(),
                getGender(), getIdentityDocument(), getPhoneNumber(), getEMailAddress(),
                isAdult(), isMilitary(), getPersuasion(), isPrivileged(),
                getKnowledgeOfForeignLanguages(), getCertificateMark(),
                getUALanguageZNOResults(), getEnglishLanguageZNOResults(),
                getHistoryZNOResults(), isStateEmployee(), isScholar(),
                getStudentTicketNumber(), getCreditBookNumber(), getSpeciality(),
                getChair(), getEducationLevel(), isReTakesTheExams(), getTitleOfThesis(),
                getSupervisor(), getSpecialCourses(), getNumberOfConferences(),
                getNumberOfScientificArticles(), isParticipationInLegalClinic(),
                isSportsActivist(), isArtActivist(), getSpecialAwards(), getNotes());
    }

        // 4. Create a builder for the class Student.
    /*Here we create Builder for class Student.*/

    public static class Builder {
        private Student StudentToBuild;

        public Builder() {
            this.StudentToBuild = new Student();
        }

        // 4. Create a builder for the class Student.
    /*Here we create method SimilarTo for class Student.*/

        public Builder setSimilarTo(Student student){
            this.StudentToBuild.FirstName = student.FirstName;
            this.StudentToBuild.SurName = student.SurName;
            this.StudentToBuild.Patronymic = student.Patronymic;
            this.StudentToBuild.birthday = student.birthday;
            this.StudentToBuild.Gender = student.Gender;
            this.StudentToBuild.IdentityDocument = student.IdentityDocument;
            this.StudentToBuild.PhoneNumber = student.PhoneNumber;
            this.StudentToBuild.EMailAddress = student.EMailAddress;
            this.StudentToBuild.isAdult = student.isAdult;
            this.StudentToBuild.isMilitary = student.isMilitary;
            this.StudentToBuild.Persuasion = student.Persuasion;
            this.StudentToBuild.isPrivileged = student.isPrivileged;
            this.StudentToBuild.KnowledgeOfForeignLanguages
                    = student.KnowledgeOfForeignLanguages;
            this.StudentToBuild.CertificateMark = student.CertificateMark;
            this.StudentToBuild.UALanguageZNOResults = student.UALanguageZNOResults;
            this.StudentToBuild.EnglishLanguageZNOResults
                    = student.EnglishLanguageZNOResults;
            this.StudentToBuild.HistoryZNOResults = student.HistoryZNOResults;
            this.StudentToBuild.IsStateEmployee = student.IsStateEmployee;
            this.StudentToBuild.isScholar = student.isScholar;
            this.StudentToBuild.StudentTicketNumber = student.StudentTicketNumber;
            this.StudentToBuild.CreditBookNumber = student.CreditBookNumber;
            this.StudentToBuild.Speciality = student.Speciality;
            this.StudentToBuild.Chair = student.Chair;
            this.StudentToBuild.EducationLevel = student.EducationLevel;
            this.StudentToBuild.isReTakesTheExams = student.isReTakesTheExams;
            this.StudentToBuild.TitleOfThesis = student.TitleOfThesis;
            this.StudentToBuild.Supervisor = student.Supervisor;
            this.StudentToBuild.SpecialCourses = student.SpecialCourses;
            this.StudentToBuild.NumberOfConferences = student.NumberOfConferences;
            this.StudentToBuild.NumberOfScientificArticles
                    = student.NumberOfScientificArticles;
            this.StudentToBuild.ParticipationInLegalClinic
                    = student.ParticipationInLegalClinic;
            this.StudentToBuild.IsSportsActivist = student.IsSportsActivist;
            this.StudentToBuild.IsArtActivist = student.IsArtActivist;
            this.StudentToBuild.SpecialAwards = student.SpecialAwards;
            this.StudentToBuild.Notes = student.Notes;
            return this;
        }

        // 4. Create a builder for the class Student.
    /*Here we create another methods for class Student.*/

        Builder setFirstName(String FirstName){
            StudentToBuild.setFirstName(FirstName);
            return this;
        }

        Builder setSurName (String SurName) {
            StudentToBuild.setSurName(SurName);
            return this;
        }

        Builder setPatronymic (String Patronymic) {
            StudentToBuild.setPatronymic(Patronymic);
            return this;
        }

        Builder setBirthday (LocalDate Birthday) {
            StudentToBuild.setBirthday(Birthday);
            return this;
        }

        Builder setGender (String Gender) {
            StudentToBuild.setGender(Gender);
            return this;
        }

        Builder setIdentityDocument (String IdentityDocument) {
            StudentToBuild.setIdentityDocument(IdentityDocument);
            return this;
        }

        Builder setPhoneNumber (String PhoneNumber) {
            StudentToBuild.setPhoneNumber(PhoneNumber);
            return this;
        }

        Builder setEMailAddress (String EMailAddress) {
            StudentToBuild.setEMailAddress(EMailAddress);
            return this;
        }

        Builder setIsAdult (boolean IsAdult) {
            StudentToBuild.setAdult(IsAdult);
            return this;
        }

        Builder setIsMilitary (boolean IsMilitary) {
            StudentToBuild.setMilitary(IsMilitary);
            return this;
        }

        Builder setPersuasion (String Persuasion) {
            StudentToBuild.setPersuasion(Persuasion);
            return this;
        }

        Builder setIsPrivileged (boolean IsPrivileged) {
            StudentToBuild.setPrivileged(IsPrivileged);
            return this;
        }

        Builder setKnowledgeOfForeignLanguages (String KnowledgeOfForeignLanguages) {
            StudentToBuild.setKnowledgeOfForeignLanguages(KnowledgeOfForeignLanguages);
            return this;
        }

        Builder setCertificateMark (int CertificateMark) {
            StudentToBuild.setCertificateMark(CertificateMark);
            return this;
        }

        Builder setUALanguageZNOResults (int UALanguageZNOResults) {
            StudentToBuild.setUALanguageZNOResults(UALanguageZNOResults);
            return this;
        }

        Builder setEnglishLanguageZNOResults (int EnglishLanguageZNOResults) {
            StudentToBuild.setEnglishLanguageZNOResults(EnglishLanguageZNOResults);
            return this;
        }

        Builder setHistoryZNOResults (int HistoryZNOResults) {
            StudentToBuild.setHistoryZNOResults(HistoryZNOResults);
            return this;
        }

        Builder setIsStateEmployee (boolean IsStateEmployee) {
            StudentToBuild.setStateEmployee(IsStateEmployee);
            return this;
        }

        Builder setIsScholar (boolean IsScholar) {
            StudentToBuild.setScholar(IsScholar);
            return this;
        }

        Builder setStudentTicketNumber (int StudentTicketNumber) {
            StudentToBuild.setStudentTicketNumber(StudentTicketNumber);
            return this;
        }

        Builder setCreditBookNumber (int CreditBookNumber) {
            StudentToBuild.setCreditBookNumber(CreditBookNumber);
            return this;
        }

        Builder setSpeciality (String Speciality) {
            StudentToBuild.setSpeciality(Speciality);
            return this;
        }

        Builder setChair (String Chair) {
            StudentToBuild.setChair(Chair);
            return this;
        }

        Builder setEducationLevel (String EducationLevel) {
            StudentToBuild.setEducationLevel(EducationLevel);
            return this;
        }

        Builder setIsReTakesTheExams (boolean IsReTakesTheExams) {
            StudentToBuild.setReTakesTheExams(IsReTakesTheExams);
            return this;
        }

        Builder setTitleOfThesis (String TitleOfThesis) {
            StudentToBuild.setTitleOfThesis(TitleOfThesis);
            return this;
        }

        Builder setSupervisor (String Supervisor) {
            StudentToBuild.setSupervisor(Supervisor);
            return this;
        }

        Builder setSpecialCourses (String SpecialCourses) {
            StudentToBuild.setSpecialCourses(SpecialCourses);
            return this;
        }

        Builder setNumberOfConferences (int NumberOfConferences) {
            StudentToBuild.setNumberOfConferences(NumberOfConferences);
            return this;
        }

        Builder setNumberOfScientificArticles (int NumberOfScientificArticles) {
            StudentToBuild.setNumberOfScientificArticles(NumberOfScientificArticles);
            return this;
        }

        Builder setParticipationInLegalClinic (boolean ParticipationInLegalClinic) {
            StudentToBuild.setParticipationInLegalClinic(ParticipationInLegalClinic);
            return this;
        }

        Builder setIsSportsActivist (boolean IsSportsActivist) {
            StudentToBuild.setSportsActivist(IsSportsActivist);
            return this;
        }

        Builder setIsArtActivist (boolean IsArtActivist) {
            StudentToBuild.setArtActivist(IsArtActivist);
            return this;
        }

        Builder setSpecialAwards (String SpecialAwards) {
            StudentToBuild.setSpecialAwards(SpecialAwards);
            return this;
        }

        Builder setNotes (String Notes) {
            StudentToBuild.setNotes(Notes);
            return this;
        }

        Student build(){
            return StudentToBuild;
        }

    }
}
