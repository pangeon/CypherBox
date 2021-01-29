package pl.cecherz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pl.cecherz.encryption_methods.CaesarCypherTest;
import pl.cecherz.generators.PasswordCreatorTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CaesarCypherTest.class,
        PasswordCreatorTest.class
})
public class TestRunner {

}
