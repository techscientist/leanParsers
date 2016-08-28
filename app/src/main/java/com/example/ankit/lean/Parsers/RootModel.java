import java.util.ArrayList;

class RootModel {

	public int id;
	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String description;
	public String state;
	public String logo;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public String organizer_description;
	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public String start_time;
	public String topic;
	public CreatorModel _creator;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(int id, CopyrightModel copyright, String timezone, String type, String description, String state, String logo, String background_image, String email, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String privacy, String location_name, String organizer_description, String end_time, String organizer_name, String schedule_published_on, String start_time, String topic, CreatorModel creator, String name, String code_of_conduct, VersionModel version) {

		this.id = id;
		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.topic = topic;
		this._creator = creator;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}