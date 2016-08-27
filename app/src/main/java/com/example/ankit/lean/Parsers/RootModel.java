import java.util.ArrayList;

class RootModel {

	public String topic;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String end_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_name;
	public String state;
	public String type;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public int id;
	public String start_time;
	public String email;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;

	public RootModel(String topic, String schedule_published_on, String location_name, String name, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String end_time, String logo, Call_for_papersModel call_for_papers, String timezone, String organizer_name, String state, String type, String privacy, String description, CreatorModel creator, int id, String start_time, String email, String background_image, CopyrightModel copyright, VersionModel version) {

		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.state = state;
		this.type = type;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.start_time = start_time;
		this.email = email;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;

	}

}