import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String email;
	public String schedule_published_on;
	public String description;
	public String privacy;
	public CopyrightModel _copyright;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_description;
	public String organizer_name;
	public String location_name;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String timezone;
	public int id;
	public VersionModel _version;
	public String type;
	public String start_time;

	public RootModel(String background_image, String code_of_conduct, CreatorModel creator, String email, String schedule_published_on, String description, String privacy, CopyrightModel copyright, String end_time, Call_for_papersModel call_for_papers, String logo, String organizer_description, String organizer_name, String location_name, String topic, String state, ArrayList<Social_linksModel> social_links, String name, String timezone, int id, VersionModel version, String type, String start_time) {

		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.timezone = timezone;
		this.id = id;
		this._version = version;
		this.type = type;
		this.start_time = start_time;

	}

}