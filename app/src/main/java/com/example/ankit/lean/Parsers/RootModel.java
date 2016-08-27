import java.util.ArrayList;

class RootModel {

	public String email;
	public int id;
	public String topic;
	public String type;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String description;
	public String logo;
	public CreatorModel _creator;
	public String start_time;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String privacy;
	public String background_image;
	public String organizer_description;

	public RootModel(String email, int id, String topic, String type, String timezone, String organizer_name, VersionModel version, CopyrightModel copyright, String name, String code_of_conduct, String schedule_published_on, String description, String logo, CreatorModel creator, String start_time, String end_time, ArrayList<Social_linksModel> social_links, String location_name, Call_for_papersModel call_for_papers, String state, String privacy, String background_image, String organizer_description) {

		this.email = email;
		this.id = id;
		this.topic = topic;
		this.type = type;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.logo = logo;
		this._creator = creator;
		this.start_time = start_time;
		this.end_time = end_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_description = organizer_description;

	}

}