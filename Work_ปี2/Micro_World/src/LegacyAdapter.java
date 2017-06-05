
public class LegacyAdapter implements IUnit {
	
	private LegacyUnit legacyUnit;
	
	public LegacyAdapter(LegacyUnit legacyUnit) {
		this.legacyUnit = legacyUnit;
	}

	@Override
	public void move() {
		legacyUnit.move();
	}

	@Override
	public int getX() {		
		return legacyUnit.getX();
	}

	@Override
	public int getY() {
		return legacyUnit.getY();
	}

	@Override
	public String getName() {
		return "legacy";
	}

	@Override
	public int getHealth() {
		return 999;
	}

	@Override
	public boolean dead() {
		return false;
	}

}
