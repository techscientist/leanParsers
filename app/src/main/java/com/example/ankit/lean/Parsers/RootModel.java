import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public VersionModel _version;
	public String description;
	public String email;
	public String code_of_conduct;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public String organizer_description;
	public String organizer_name;
	public CreatorModel _creator;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;
	public int id;
	public String type;
	public String location_name;
	public String start_time;

	public RootModel(String end_time, CopyrightModel copyright, String timezone, String name, VersionModel version, String description, String email, String code_of_conduct, String state, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, String organizer_description, String organizer_name, CreatorModel creator, String privacy, Call_for_papersModel call_for_papers, String logo, String topic, int id, String type, String location_name, String start_time) {

		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this._version = version;
		this.description = description;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.type = type;
		this.location_name = location_name;
		this.start_time = start_time;

	}

}