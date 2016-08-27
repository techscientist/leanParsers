import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String end_time;
	public VersionModel _version;
	public String logo;
	public String start_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public int id;
	public String topic;
	public String state;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String timezone;
	public CreatorModel _creator;
	public String type;
	public String name;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, String end_time, VersionModel version, String logo, String start_time, String email, ArrayList<Social_linksModel> social_links, String organizer_description, String description, int id, String topic, String state, String location_name, String background_image, String organizer_name, String privacy, Call_for_papersModel call_for_papers, CopyrightModel copyright, String timezone, CreatorModel creator, String type, String name, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;
		this.start_time = start_time;
		this.email = email;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this.id = id;
		this.topic = topic;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.timezone = timezone;
		this._creator = creator;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;

	}

}