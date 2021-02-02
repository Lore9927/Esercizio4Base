package entities;

public class SalutatoreInformale implements ISalutatore 
{

	@Override
	public String salutaMattino(String name) 
	{
		return "Ciao " + name + ", ben svegliato!";
	}

	@Override
	public String salutaSera(String name) 
	{
		return "Ciao " + name + ", buonaserata";
	}

	@Override
	public String salutaNotte(String name) 
	{
		return "Ciao " + name + ", buonanotte";
	}

}
