import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public String location_name;
	public String description;
	public String organizer_name;
	public String name;
	public String schedule_published_on;
	public String topic;
	public String privacy;
	public String timezone;
	public String background_image;
	public VersionModel _version;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String start_time;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public int id;
	public String email;
	public String organizer_description;
	public String code_of_conduct;

	public RootModel(CreatorModel creator, String end_time, String location_name, String description, String organizer_name, String name, String schedule_published_on, String topic, String privacy, String timezone, String background_image, VersionModel version, String state, ArrayList<Social_linksModel> social_links, String type, String start_time, CopyrightModel copyright, Call_for_papersModel call_for_papers, String logo, int id, String email, String organizer_description, String code_of_conduct) {

		this._creator = creator;
		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this._version = version;
		this.state = state;
		this.social_links = social_links;
		this.type = type;
		this.start_time = start_time;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.id = id;
		this.email = email;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;

	}

}