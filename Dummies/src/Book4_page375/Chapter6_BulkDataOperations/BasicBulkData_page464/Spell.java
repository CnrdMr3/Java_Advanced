package Book4_page375.Chapter6_BulkDataOperations.BasicBulkData_page464;

import java.util.ArrayList;

/**
 * The type Spell.
 */
public class Spell {
	/**
	 * The Name.
	 */
	public String name;
	/**
	 * The Type.
	 */
	public SpellType type;
	/**
	 * The Description.
	 */
	public String description;

	/**
	 * The enum Spell type.
	 */
	public enum SpellType {
		/**
		 * Spell spell type.
		 */
		SPELL,
		/**
		 * Charm spell type.
		 */
		CHARM,
		/**
		 * Curse spell type.
		 */
		CURSE}

	/**
	 * Instantiates a new Spell.
	 *
	 * @param spellName        the spell name
	 * @param spellType        the spell type
	 * @param spellDescription the spell description
	 */
	public Spell(String spellName, SpellType spellType,
                 String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

	/**
	 * To string string.
	 *
	 * @return the string
	 */
	public String toString() {
        return name;
    }

	/**
	 * The type Spells.
	 */
	public static class Spells {
		/**
		 * The entry point of application.
		 *
		 * @param args the input arguments
		 */
		public static void main(String[] args) {

            ArrayList<Spell> spells = new ArrayList<>();
            spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear."));
            spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand."));
            spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something."));
            spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone."));
            spells.add(new Spell("Finite Incatatum", SpellType.SPELL, "Stops all current spells."));
            spells.add(new Spell("Locomotor Mortis", SpellType.CURSE, "Locks an opponent's legs."));

            for (Spell spell : spells)
                System.out.println(spell.name);
            spells.stream().forEach(s -> System.out.println(s));

            for (Spell spell : spells) {
                if (spell.type == SpellType.SPELL)
                    System.out.println(spell.name);
            }
            spells.stream()
                    .filter(s -> s.type == SpellType.SPELL)
                    .forEach(s -> System.out.println(s));

            spells.parallelStream()
                    .filter(s -> s.type == SpellType.SPELL)
                    .filter(s -> s.name.toLowerCase().startsWith("a"))
                    .forEach(s -> System.out.println(s));
        }
    }
}
