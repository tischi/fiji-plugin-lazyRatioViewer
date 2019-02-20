import de.embl.cba.LazyRatioViewerCommand;
import ij.IJ;

public class RunLazyRatioViewerCommand
{

	public static void main( String... args )
	{

		final net.imagej.ImageJ ij = new net.imagej.ImageJ();
		ij.ui().showUI();

		IJ.open( RunLazyRatioViewerCommand.class.getResource( "test.tif"  ).getFile() );

		ij.command().run( LazyRatioViewerCommand.class, true );
	}
}
