import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizerdescription;
	public String timezone;
	public String organizername;
	public int id;
	public String topic;
	public String description;
	public Copyrigh_tModel _copyrigh_t;
	public String logo;
	public ArrayList<SociallinksModel> sociallinks;
	public String code_ofconduct;
	public String email;
	public String backgroundimage;
	public String end_time;
	public Call_forpapersModel _call_forpapers;
	public String locatio_name;
	public VersionModel _version;
	public String privacy;
	public String schedulepublished_on;
	public String name;
	public String type;
	public CreatorModel _creator;
	public String state;

	public RootModel(String start_time, String organizerdescription, String timezone, String organizername, int id, String topic, String description, Copyrigh_tModel copyrigh_t, String logo, ArrayList<SociallinksModel> sociallinks, String code_ofconduct, String email, String backgroundimage, String end_time, Call_forpapersModel call_forpapers, String locatio_name, VersionModel version, String privacy, String schedulepublished_on, String name, String type, CreatorModel creator, String state) {

		this.start_time = start_time;
		this.organizerdescription = organizerdescription;
		this.timezone = timezone;
		this.organizername = organizername;
		this.id = id;
		this.topic = topic;
		this.description = description;
		this._copyrigh_t = copyrigh_t;
		this.logo = logo;
		this.sociallinks = sociallinks;
		this.code_ofconduct = code_ofconduct;
		this.email = email;
		this.backgroundimage = backgroundimage;
		this.end_time = end_time;
		this._call_forpapers = call_forpapers;
		this.locatio_name = locatio_name;
		this._version = version;
		this.privacy = privacy;
		this.schedulepublished_on = schedulepublished_on;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this.state = state;

	}

}