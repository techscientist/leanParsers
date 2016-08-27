import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String type;
	public String organizer_name;
	public CreatorModel _creator;
	public int id;
	public CopyrightModel _copyright;
	public String email;
	public String state;
	public String timezone;
	public String organizer_description;
	public VersionModel _version;
	public String location_name;
	public String background_image;
	public String topic;
	public String schedule_published_on;
	public String description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String end_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;

	public RootModel(String code_of_conduct, String type, String organizer_name, CreatorModel creator, int id, CopyrightModel copyright, String email, String state, String timezone, String organizer_description, VersionModel version, String location_name, String background_image, String topic, String schedule_published_on, String description, String privacy, Call_for_papersModel call_for_papers, String logo, String end_time, String name, ArrayList<Social_linksModel> social_links, String start_time) {

		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.id = id;
		this._copyright = copyright;
		this.email = email;
		this.state = state;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._version = version;
		this.location_name = location_name;
		this.background_image = background_image;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.end_time = end_time;
		this.name = name;
		this.social_links = social_links;
		this.start_time = start_time;

	}

}