package example.packt.com.embeddedapp.client.oauth2;

import android.net.Uri;

import example.packt.com.embeddedapp.client.ClientAPI;

public class AuthorizationRequest {
    public static final String REDIRECT_URI
            = "oauth2://profile/callback";

    public static Uri createAuthorizationURI(String state) {
        return new Uri.Builder()
            .scheme("http")
            .encodedAuthority(ClientAPI.BASE_URL)
            .path("/oauth/authorize")
            .appendQueryParameter("client_id", "clientapp")
            .appendQueryParameter("response_type", "token")
            .appendQueryParameter("redirect_uri", REDIRECT_URI)
            .appendQueryParameter("scope", "read_profile")
            .appendQueryParameter("state", state)
            .build();
    }
}
