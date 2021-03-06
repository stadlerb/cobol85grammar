package org.cobol85.gpl.lineformat;

import java.io.File;

import org.cobol85.applicationcontext.Cobol85GrammarContextFactory;
import org.cobol85.preprocessor.Cobol85Preprocessor.Cobol85FormatEnum;
import org.cobol85.runner.Cobol85ParseTestRunner;
import org.cobol85.runner.impl.Cobol85ParseTestRunnerImpl;
import org.junit.Test;

public class TandemTest {

	@Test
	public void testDefinedFormat() throws Exception {
		Cobol85GrammarContextFactory.configureDefaultApplicationContext();

		final File inputFile = new File("src/test/resources/org/cobol85/gpl/lineformat/Tandem.cbl");
		final Cobol85ParseTestRunner runner = new Cobol85ParseTestRunnerImpl();
		runner.parseFile(inputFile, new Cobol85FormatEnum[] { Cobol85FormatEnum.TANDEM });
	}

}