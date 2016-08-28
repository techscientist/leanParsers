import java.util.ArrayList;

class RootModel {

	public String logo;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_name;
	public String start_time;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public String description;
	public String topic;
	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(String logo, String code_of_conduct, String name, VersionModel version, String type, ArrayList<Social_linksModel> social_links, int id, String organizer_name, String start_time, String email, String background_image, CopyrightModel copyright, String timezone, CreatorModel creator, String schedule_published_on, String end_time, String state, String description, String topic, String privacy, String location_name, Call_for_papersModel call_for_papers, String organizer_description) {

		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this.type = type;
		this.social_links = social_links;
		this.id = id;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.description = description;
		this.topic = topic;
		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}