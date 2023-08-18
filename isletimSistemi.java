class isletimSistemi {

  // İşletim sisteminin adını ve sürümünü belirlemek için Java Programı.
  public static void main(String[] args) {

    String operatingSystem = System.getProperty("os.name");
    System.out.println(operatingSystem);

  }
}