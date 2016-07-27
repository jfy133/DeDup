
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AllReadsAsMergedTest.class,
	ForwardTest.class,
	ForwardWithMergedTest.class,
	ReverseMergedTest.class,
	ReverseTest.class,
	ReverseWithMergedTest.class,
	YieldTest.class
})
public class DuplicateTestSuite {}