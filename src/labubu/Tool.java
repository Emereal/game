package labubu;

public class Tool extends Item {
	private static boolean usedTool;
	
	public Tool() {
		super("tool");
		usedTool = false;
	}
	
	@Override
	public void use() {
		if (Game.getCurrentRoom().getName().equals("Bedroom")) {
			if (usedTool) {
				CozyAdventureGUI.addStoryDtl("You already opened the attic door!");
			} else {
				Game.getCurrentRoom().getExit(4).setLockStatus(false);
				usedTool = true;
				CozyAdventureGUI.addStoryDtl("Using the tool, you are able to reach the latch to the Attic and\npull the ladder down!! You can now access the Attic."+"\n");
			}
		} else
			CozyAdventureGUI.addStoryDtl("You don't see any way to use the tool…");
		}

}
