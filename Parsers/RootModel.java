import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_description;
	public String organizer_name;
	public String description;
	public String state;
	public String logo;
	public int id;
	public String type;
	public VersionModel _version;
	public String topic;
	public String start_time;
	public String timezone;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(String code_of_conduct, String organizer_description, String organizer_name, String description, String state, String logo, int id, String type, VersionModel version, String topic, String start_time, String timezone, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String background_image, String email, String name, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, CreatorModel creator, String end_time) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.id = id;
		this.type = type;
		this._version = version;
		this.topic = topic;
		this.start_time = start_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this._creator = creator;
		this.end_time = end_time;

	}

}