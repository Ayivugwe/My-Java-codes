/**
 * @param pPhoneNumber
 * @return true if the phone number is correct
 */
private boolean isPhoneNumberCorrect(String pPhoneNumber) {

    Pattern pattern = Pattern
            .compile("((\\+[1-9]{3,4}|0[1-9]{4}|00[1-9]{3})\\-?)?\\d{8,20}");
    Matcher matcher = pattern.matcher(pPhoneNumber);

    if (matcher.matches()) return true;


    return false;
}



<p:inputText id="phone2" value="#{autorisationMouvementB.telephoneLien}">
								
								</p:inputText>







/////////////////////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\
											insertUpdateAutorisationMouvement	
////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////////////////////////////////////////////



public boolean insertUpdateAutorisationMouvement( AutorisationMouvementC autor)
	{
		boolean saved= false;
		System.out.println("Dans insertUpdate");
		try {
			con.setAutoCommit(false);
			if (autor.getId() == 0) 
			{
				
			saved = insertPersonne(autor.getPersonne());
			if(saved)
			{
				saved = insertAutorisationMouvement(autor);
				System.out.println("saved autorisationMouvement apres insertPersonne : "+saved);
				if(saved){
					System.out.println("Avant DetailAutorisationMouvement ");
					for (DetailAutorisationMouvementC det : autor.getListeDetailAutorisationMouvement()) {
						det.setAutorisationMouv(autor);
						det.getDocVoyEtr().setPersonne(autor.getPersonne());
						saved = InsertDocumentsVoyageEtrangers(det.getDocVoyEtr());
				
							if (saved) {
								saved = insertDetailAutorisationMouvement(det);
								if (saved) {
									for (DocumentsFournisDemandeAutorisationC docF : det.getListeDocumentsFournisDemandeAutorisation()) {
										docF.setDetailAutorisationMouvement(det);
										saved = insertDocumentsFournisDemandeAutorisation(docF);
										if (!saved)
											break;
									}

								}
							} else
							break;

							}
							
						}
				}
				
			}
			if(saved)
			{
				
			}
			//saved = InsertDocumentsVoyageEtrangers(autor.getDocumentVoyageEtrangers());
			
			System.out.println("Apres insertAutorisation");
			System.out.println("Saved = "+saved);
			}
			else
				saved = updateAutorisationMouvement(autor);
		if (saved)
			
			con.commit();
		else
			con.rollback();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return saved;
	}
	