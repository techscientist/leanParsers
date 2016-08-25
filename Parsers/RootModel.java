import java.util.ArrayList;

class RootModel {

	public String description;
	public int id;
	public String name;
	public String type;
	public String schedulepublished_on;
	public String code_of_conduct;
	public String locatio_name;
	public VersionModel _version;
	public String topic;
	public ArrayList<SociallinksModel> sociallinks;
	public String logo;
	public String end_time;
	public String state;
	public CreatoModel _creato;
	public String organizername;
	public CopyrightModel _copyright;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizerdescription;
	public String background_image;
	public String start_time;
	public String timezone;

	public RootModel(String description, int id, String name, String type, String schedulepublished_on, String code_of_conduct, String locatio_name, VersionModel version, String topic, ArrayList<SociallinksModel> sociallinks, String logo, String end_time, String state, CreatoModel creato, String organizername, CopyrightModel copyright, String privacy, Call_for_papersModel call_for_papers, String email, String organizerdescription, String background_image, String start_time, String timezone) {

		this.description = description;
		this.id = id;
		this.name = name;
		this.type = type;
		this.schedulepublished_on = schedulepublished_on;
		this.code_of_conduct = code_of_conduct;
		this.locatio_name = locatio_name;
		this._version = version;
		this.topic = topic;
		this.sociallinks = sociallinks;
		this.logo = logo;
		this.end_time = end_time;
		this.state = state;
		this._creato = creato;
		this.organizername = organizername;
		this._copyright = copyright;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizerdescription = organizerdescription;
		this.background_image = background_image;
		this.start_time = start_time;
		this.timezone = timezone;

	}

}