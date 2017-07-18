package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBuilder<Building> implements Builder<Building> {
	
	private List<Materials<Building>> materialsList;

	public AbstractBuilder() {
		materialsList = new ArrayList<>();
	}

	protected abstract Building createBuilding();
	
	protected void add(Materials<Building> materials){
		materialsList.add(materials);
	}

	@Override
	public Building build() {
		Building building = createBuilding();
		for(Materials<Building> materials:materialsList){
			materials.build(building);
		}
		return building;
	}
	
	protected interface Materials<Building>{
		void build(Building building);
	}

}
