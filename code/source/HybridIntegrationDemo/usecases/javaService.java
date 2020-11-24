package HybridIntegrationDemo.usecases;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaService

{
	// ---( internal utility methods )---

	final static javaService _instance = new javaService();

	static javaService _newInstance() { return new javaService(); }

	static javaService _cast(Object o) { return (javaService)o; }

	// ---( server methods )---




	public static final void addNumbers (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(addNumbers)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required strFinal
	
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	
	// pipeline
	IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
	pipelineCursor.destroy();
	
	// pipeline
	IDataCursor pipelineCursor_1 = pipeline.getCursor();
	IDataUtil.put( pipelineCursor_1, "strFinal");
	pipelineCursor_1.destroy();
		
	// --- <<IS-END-SHARED>> ---
}

