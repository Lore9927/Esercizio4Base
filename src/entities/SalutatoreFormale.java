package entities;

public class SalutatoreFormale implements ISalutatore
{

	@Override
	public String salutaMattino(String name) 
	{
		return "Buongiorno " + name;
	}

	@Override
	public String salutaSera(String name) 
	{
		return "Buonasera " + name;
	}

	@Override
	public String salutaNotte(String name) 
	{
		return "Buonanotte " + name;
	}

}
