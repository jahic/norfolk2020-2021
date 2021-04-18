package part.norfolk.intro;

/**
 * A simple example that demonstrates how to use (static) class member.
 * Default access modifier.
 * Access Levels
 * Modifier        Class    Package    Subclass    World
 * -----------------------------------------------------
 * public           Y        Y          Y           Y
 * protected        Y        Y          Y           N
 * (Default)        Y        Y          N           N
 * private          Y        N          N           N
 * @author jahic
 *
 */

public class ClassMember {
	static int a=10;
	
	public static void main(String[] args) {
		System.out.println("The value of a is "+a+".");
	}
}
