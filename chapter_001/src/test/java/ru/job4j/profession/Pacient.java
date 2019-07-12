package ru.job4j.profession;

public class Pacient {
  private String name;
  private String userName;
  private Diagnose diagnose;
  private int[] numOfTeeth;
  private boolean healthy;

  public int[] getNumOfTeeth() {
    return numOfTeeth;
  }

  public void setNumOfTeeth(int[] numOfTeeth) {
    this.numOfTeeth = numOfTeeth;
  }

  public boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(boolean healthy) {
    this.healthy = healthy;
  }

  public Diagnose getDiagnose() {
    return diagnose;
  }

  public String getName() {
    return name;
  }

  public String getUserName() {
    return userName;
  }
}
