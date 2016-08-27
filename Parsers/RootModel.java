import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String organizer_name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String logo;
	public String name;
	public String description;
	public String background_image;
	public String type;
	public VersionModel _version;
	public CreatorModel _creator;
	public String topic;
	public String timezone;
	public String location_name;
	public CopyrightModel _copyright;
	public String end_time;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String start_time;

	public RootModel(String organizer_description, String organizer_name, String privacy, ArrayList<Social_linksModel> social_links, String state, Call_for_papersModel call_for_papers, String email, String logo, String name, String description, String background_image, String type, VersionModel version, CreatorModel creator, String topic, String timezone, String location_name, CopyrightModel copyright, String end_time, String code_of_conduct, int id, String schedule_published_on, String start_time) {

		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this._creator = creator;
		this.topic = topic;
		this.timezone = timezone;
		this.location_name = location_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;

	}

}