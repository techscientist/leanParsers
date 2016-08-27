import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String start_time;
	public String organizer_name;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public String end_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String name;
	public String topic;
	public String description;

	public RootModel(String timezone, String location_name, String start_time, String organizer_name, String email, String background_image, CopyrightModel copyright, String logo, ArrayList<Social_linksModel> social_links, int id, String schedule_published_on, String type, String privacy, CreatorModel creator, String code_of_conduct, String state, String end_time, VersionModel version, Call_for_papersModel call_for_papers, String organizer_description, String name, String topic, String description) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this.logo = logo;
		this.social_links = social_links;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.end_time = end_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.name = name;
		this.topic = topic;
		this.description = description;

	}

}