package ru.job4j.profession;

public class Doctor extends Profession {

  private String qualification;
  private String colorBathrobe;

  public String getQualification() {
    return qualification;
  }

  public String getColorBathrobe() {
    return colorBathrobe;
  }

  public Diagnose heal(Pacient pacient) {
    return pacient.getDiagnose();
  }
}
