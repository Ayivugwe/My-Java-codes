else if (Helper.validerDate(this.getDateProbableEntreeS().trim()).after(Helper.addMonth(this.demandeVisaSelected.getDateDemandeD(), 6))){
			Helper.afficherMessage("Désolé", "La date probable entree doit etre superieure de 6 mois à la date de demande");
		}