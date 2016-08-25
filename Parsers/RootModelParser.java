import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		VersionModelParser version_parser = new VersionModelParser();
		SociallinksModelParser sociallinks_parser;
		CreatoModelParser creato_parser = new CreatoModelParser();
		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
					JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");
			
					for(int i = 0 ;i<sociallinks_arr.length();i++){

 						sociallinkss.add(sociallinks_parser.parseSociallinksModel((String)sociallinks_arr.get(i)));

					}

					CreatoModel creato = creato_parser.parseCreatoModel(jsobj.getJSONObject("creato").toString());

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					local_model = new RootModel(jsobj.getString("description") , jsobj.getInt("id") , jsobj.getString("name") , jsobj.getString("type") , jsobj.getString("schedulepublished_on") , jsobj.getString("code_of_conduct") , jsobj.getString("locatio_name") , version, jsobj.getString("topic") , sociallinkss, jsobj.getString("logo") , jsobj.getString("end_time") , jsobj.getString("state") , creato, jsobj.getString("organizername") , copyright, jsobj.getString("privacy") , call_for_papers, jsobj.getString("email") , jsobj.getString("organizerdescription") , jsobj.getString("background_image") , jsobj.getString("start_time") , jsobj.getString("timezone") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}