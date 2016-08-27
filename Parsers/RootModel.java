import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String location_name;
	public String privacy;
	public String organizer_name;
	public VersionModel _version;
	public String email;
	public String logo;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public String schedule_published_on;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public int id;
	public String organizer_description;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;
	public String timezone;
	public String end_time;

	public RootModel(String start_time, String location_name, String privacy, String organizer_name, VersionModel version, String email, String logo, String code_of_conduct, ArrayList<Social_linksModel> social_links, String type, String name, String schedule_published_on, String description, Call_for_papersModel call_for_papers, String topic, String state, int id, String organizer_description, CopyrightModel copyright, CreatorModel creator, String background_image, String timezone, String end_time) {

		this.start_time = start_time;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._version = version;
		this.email = email;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this.id = id;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;

	}

}