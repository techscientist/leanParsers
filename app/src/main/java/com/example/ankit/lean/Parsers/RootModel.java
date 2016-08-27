import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_name;
	public String end_time;
	public String code_of_conduct;
	public String email;
	public String background_image;
	public String schedule_published_on;
	public VersionModel _version;
	public String timezone;
	public int id;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String type;
	public String privacy;
	public String location_name;
	public String name;
	public String start_time;

	public RootModel(String state, CopyrightModel copyright, String organizer_description, ArrayList<Social_linksModel> social_links, String description, String organizer_name, String end_time, String code_of_conduct, String email, String background_image, String schedule_published_on, VersionModel version, String timezone, int id, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, String logo, String type, String privacy, String location_name, String name, String start_time) {

		this.state = state;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.description = description;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.timezone = timezone;
		this.id = id;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.type = type;
		this.privacy = privacy;
		this.location_name = location_name;
		this.name = name;
		this.start_time = start_time;

	}

}