package dcso.util;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.io.InputStream;

public class JSFUtils {

    private static ExternalContext getExternalContext() {
        FacesContext facesContext =
                FacesContext.getCurrentInstance();
        ExternalContext externalContext =
                facesContext.getExternalContext();
        return externalContext;
    }

    /**
     * Obtain resource as Stream. The caller must close this
     * stream after use.
     *
     * @param pathName
     *            Path of the resource. For example,
     *            "/WEB-INF/classes/xys.properties".
     * @return InputStream or <code>null</code>, if no such
     *         resource exists.
     */
    public static InputStream getResourceStream(String pathName) {
        InputStream response =
                getExternalContext().getResourceAsStream(
                        pathName);
        return response;
    }
}
