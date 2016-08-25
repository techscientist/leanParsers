import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		Copyrigh_tModelParser copyrigh_t_parser = new Copyrigh_tModelParser();
		SociallinksModelParser sociallinks_parser;
		Call_forpapersModelParser call_forpapers_parser = new Call_forpapersModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					Copyrigh_tModel copyrigh_t = copyrigh_t_parser.parseCopyrigh_tModel(jsobj.getJSONObject("copyrigh_t").toString());

					ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
					JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");
			
					for(int i = 0 ;i<sociallinks_arr.length();i++){

 						sociallinkss.add(sociallinks_parser.parseSociallinksModel((String)sociallinks_arr.get(i)));

					}

					Call_forpapersModel call_forpapers = call_forpapers_parser.parseCall_forpapersModel(jsobj.getJSONObject("call_forpapers").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					local_model = new RootModel(jsobj.getString("start_time") , jsobj.getString("organizerdescription") , jsobj.getString("timezone") , jsobj.getString("organizername") , jsobj.getInt("id") , jsobj.getString("topic") , jsobj.getString("description") , copyrigh_t, jsobj.getString("logo") , sociallinkss, jsobj.getString("code_ofconduct") , jsobj.getString("email") , jsobj.getString("backgroundimage") , jsobj.getString("end_time") , call_forpapers, jsobj.getString("locatio_name") , version, jsobj.getString("privacy") , jsobj.getString("schedulepublished_on") , jsobj.getString("name") , jsobj.getString("type") , creator, jsobj.getString("state") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}